document.querySelectorAll('.arrow-button').forEach(btn => {
    btn.addEventListener('click', e => {
        e.preventDefault;
        const traget = document.querySelector(btn.getAttribute('href'));
        traget.scrollIntoView({ behaviour: 'smooth' });
    });
});

const wrapper = document.querySelector('.sectionWrapper');
let currentIndex = 0;
const sections = document.querySelectorAll('section');
const totalSections = sections.length;

document.querySelectorAll('.arrow-button.right').forEach(btn => {
    btn.addEventListener('click', () => {
        if (currentIndex < totalSections - 1) {
            currentIndex++;
            wrapper.style.transform = `translateX(-${currentIndex * 100}vw)`;
        }
    });
});

document.querySelectorAll('.arrow-button.left').forEach(btn => {
    btn.addEventListener('click', () => {
        if (currentIndex > 0) {
            currentIndex--;
            wrapper.style.transform = `translateX(-${currentIndex * 100}vw)`;
        }
    });
});