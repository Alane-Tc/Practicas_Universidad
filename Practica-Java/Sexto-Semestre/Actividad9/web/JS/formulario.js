/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.addEventListener("load", function () {
    let inputName = document.querySelector("#input-name");
    let resultado = document.querySelector("#result");
    let button = document.querySelector("#boton");
    let save = document.querySelector("#save");

    button.disabled = true;

    let inicio = () => {

        if (typeof (Storage) !== "undefined") {

            localStorage.setItem('Nombre', inputName.value);
            resultado.innerHTML = `<span>Bienvenido ${localStorage.Nombre}</span>`;

        } else {
            document.getElementById(result).innerHTML = "Error no has registrado un nombre";
        }
    };

    save.addEventListener('click', function () {
        console.log("jalo");
        inicio();
        button.disabled = false;
    });

});

