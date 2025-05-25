// fetch("http://localhost:8080/api/product-dog")
//     .then((Response) => Response.json())
//     .then((data) =>  {
//         const product = document.querySelectorAll(".productlist1child");
//         product.forEach((el, index) => {
//             const productdog = data[index];
//             if(productdog) {
//                 const nameEl = el.querySelector('#name');
//                 const priceEl = el.querySelector('#price');
//                 const brandEl = el.querySelector('#brand');

//                 nameEl.textContent = productdog.name;
//                 priceEl.textContent = ` Gia: ${productdog.price.toLocaleString('vi-VN')} d`;
//                 brandEl.textContent = `${productdog.brand}`;
//             }
//         });
//     })    
//     .catch(error => {
//         console.error('Error:', error);
// });

fetch("http://localhost:8080/api/product-dog")
    .then((Response) => Response.json())
    .then((data) => {
        const product1 = document.getElementById("product");
        const productlist = document.getElementById("productlist");

        data.forEach((product) => {
            const clone = product1.cloneNode(true);
            clone.style.display = "flex";
            clone.removeAttribute("id");

            clone.querySeletor(".name").textConten = product.name;
            clone.querySeletor(".price").textConten = product.price;
            clone.querySeletor(".brand").textConten = product.brand;

            productlist.appendChild(clone);
        });
    })
    .catch((error) => {
        confirm.error("Loi",error);
    });
