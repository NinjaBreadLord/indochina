  <form action="javascript:signup()">
    <label for = "email" class = "label-1">Email:</label><br>
    <input type = "text" id = "email" name = "email" class = "input-1"><br>
    <label for = "password" class = "label-1">Password:</label><br>
    <input type = "password" id = "password" name = "password" class = "input-1"><br>
    <input value="Submit" type="submit" class="button"/>
  <form>

<script>
function signup() {

    const userz = document.getElementById("personlist");

    const email1 = document.getElementById("email").value;
    const password1 = document.getElementById("password").value;



    //const url = "https://everittcheng.tk/api/login/";
    const url = "http://localhost:8195/api/login/"

    const options = {
        method: 'GET', 
        mode: 'cors', 
        cache: 'default', 
        credentials: 'omit', 
        headers: {
        'Content-Type': 'application/json'
        },
    };

    // Make a GET request to retrieve a list of all existing emails

    fetch(url, options)
        .then(response => {
            if (response.status !== 200) {
                const errorMsg = 'Database response error: ' + response.status;
                console.log(errorMsg);
                const tr = document.createElement("tr");
                const td = document.createElement("td");
                td.innerHTML = errorMsg;
                tr.appendChild(td);
                userz.appendChild(tr);
                return;
            }
            response.json().then(data => {
                for (const row of data) {

                const tr = document.createElement("tr");

                const id = document.createElement("td");
                const email = document.createElement("td");
                const password = document.createElement("td");


                id.innerHTML = row.id;
                email.innerHTML = row.email;
                password.innerHTML = row.password;


                if (row.email == email1) {
                    var repeat = "repeat";
                }              
                }
            })
        })
    window.alert(email1);    
    window.alert(row.email);
    window.alert(repeat);
    // if (repeat == "repeat") {
    //     window.alert("Email already in use.");
    // } else {
    //     function inputper(event) {
    //         event.preventDefault();
    //         const data = new FormData(event.target);
    //         //var purl = "https://everittcheng.tk/api/login/post/?"
    //         var purl = "http://localhost:8195/api/login/post/?" 
    //         const urldata = new URLSearchParams(data).toString();
    //         fetch(purl + urldata, {
    //             method: "POST",
    //             mode: "no-cors",
    //             headers: {
    //                 "Content-Type": "application/json"
    //             }
    //         });
    //         const make = document.getElementById("createuser");
    //         make.addEventListener("submit", inputper);
    //     }
        
    // }
    };


</script>

