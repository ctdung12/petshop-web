// Mở đóng giao diện
function clickbtn() {
    const loginOverlap = document.getElementById("login-overlap");

    if (loginOverlap.classList.contains("hidden")) {
        loginOverlap.classList.remove("hidden");
        showLoginForm();
    } else {
        loginOverlap.classList.add("hidden");
        document.getElementById("loginform").classList.remove("active");
        document.getElementById("creatform").classList.remove("active");
    }
}
function showCreatForm() {
    const loginForm = document.getElementById("loginform");
    const createForm = document.getElementById("creatform");

    loginForm.classList.add("hidden");
    loginForm.classList.remove("active");

    createForm.classList.remove("hidden");
    createForm.classList.add("active");
}
function showLoginForm() {
    const loginForm = document.getElementById("loginform");
    const createForm = document.getElementById("creatform");

    loginForm.classList.remove("hidden");
    loginForm.classList.add("active");

    createForm.classList.add("hidden");
    createForm.classList.remove("active");
}
