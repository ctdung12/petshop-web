fetch("http://localhost:8080/api/home")
    .then((Response) => Response.json())
    .then((data) => {
        const home = document.getElementById("product");
        const list = document.getElementById("producthome");
        data.forEach((product) => {
            const clone = home.cloneNode(true);
            clone.style.display = "flex";
            clone.removeAttribute("id");

            clone.querySelector(".name").textContent = product.name;
            clone.querySelector(".brand").textContent = product.brand;
            clone.querySelector(".price").textContent = product.price;

            list.appendChild(clone);
        })
    })
    .catch((error) => {
            console.error("Loi", error);
});

function sendOtp() {
    const email = document.getElementById("email").value;
    const btn = document.getElementById("sendOtpBtn");

    fetch("http://localhost:8080/api/otp/send",{
        method: "POST",
        headers: { "Content-Type": "application/json"},
        body: JSON.stringify({email: email})
    })
    .then(res => res.text())
    .then(msg => {
        alert(msg);
                btn.disabled = true;
                let countdown = 60;
                const interval = setInterval(() => {
                    countdown--;
                    if (countdown <= 0) {
                        clearInterval(interval);
                        btn.disabled = false;                     
                    }
                }, 1000);
    })
    .catch(err => console.error("Loi",err));
}

function restOtp() {
    const email = document.getElementById("email").value;
    const code = document.getElementById("otp").value;

    fetch("http://localhost:8080/api/otp/rest",{
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({email:email, code: code})
    })
    .then(res => {
        if(res.ok) return res.text();
        else throw new Error("Mã sai hoặc hết hạn.");
    })
    .then(msg => alert(msg))
    .catch(err => alert(err.message))
}