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

(function () {
var toggler1 = document.querySelector('.theme-toggler-dop'),
	root1 = document.documentElement,
	currentTheme1 = localStorage.getItem('services');
	
	var toggler2 = document.querySelector('.theme-toggler-dop1'),
	root2 = document.documentElement;
	
	if (currentTheme1 == "0") toggler1.removeAttribute('checked');
	else toggler1.checked = "false";
	
	if (currentTheme1 == "1") toggler2.removeAttribute('checked');
	else toggler2.checked = "true";
})();
