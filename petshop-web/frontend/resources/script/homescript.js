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

fetch("http://localhost:8080/api/user")
    .then((Response) => Response.json())
    .then((data) => {
        
    })