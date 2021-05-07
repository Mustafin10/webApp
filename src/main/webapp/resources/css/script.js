(function () {
var toggler = document.querySelector('.theme-toggler input[type="checkbox"]'),
root = document.documentElement,
currentTheme = localStorage.getItem('theme') || "dark";

if (currentTheme == "light") toggler.removeAttribute('checked');
else toggler.checked = "true";


if (currentTheme == "dark") document.getElementById('themes').href="resources/css/dark-mode.css";


root.setAttribute('data-theme', currentTheme);

toggler.addEventListener('change', toggleTheme, false);

function toggleTheme(e) {
if (this.checked) {

document.getElementById('themes').href="resources/css/dark-mode.css"
localStorage.setItem('theme', 'dark');

}
else {
document.getElementById('themes').href="resources/css/light-mode.css"
localStorage.setItem('theme', 'light');

}
}
})();