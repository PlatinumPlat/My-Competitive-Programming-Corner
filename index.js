document.addEventListener("DOMContentLoaded", () => {
    const wrapper = document.querySelector('.sectionWrapper');
    let currentIndex = 0;
    const sections = document.querySelectorAll('section');

    document.querySelectorAll('.arrow-button.right').forEach(btn => {
        btn.addEventListener('click', () => {
            currentIndex++;
            wrapper.style.transform = `translateX(-${currentIndex * 100}vw)`;
        });
    });

    document.querySelectorAll('.arrow-button.left').forEach(btn => {
        btn.addEventListener('click', () => {
            currentIndex--;
            wrapper.style.transform = `translateX(-${currentIndex * 100}vw)`;
        });
    });

    const problemSelect = document.getElementById("problemSelect");

    const javaEditor = CodeMirror(document.getElementById('javaEditor'), {
        value: `public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, Java!");
  }
}`,
        mode: "text/x-java",
        lineNumbers: true,
        theme: "eclipse"
    });

    problemSelect.addEventListener("change", async (e) => {
        const problem = e.target.value;
        if (!problem) {
            javaEditor.setValue("");
            return;
        }

        try {
            const module = await import(`./solutions/${problem}.js`);
            const code = module[problem];
            javaEditor.setValue(code);
        } catch (err) {
            javaEditor.setValue("// Solution not found.");
            console.error(err);
        }
    });
});
