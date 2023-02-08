<form action="javascript:login_user()">
    <p><label>
        User ID:
        <input type="text" name="uid" id="uid" required="" />
    </label></p>
    <p><label>
        Password:
        <input type="password" name="password" id="password" required="" />
    </label></p>
    <p>
        <button>Login</button>
    </p>
</form>

<script>
    // prepare URL's to allow easy switch from deployment and localhost
    // var url = "https://everittcheng.tk"
    url = "http://localhost:8195"

    const login_url = url + '/authenticate';


    function login_user(){
        //Validate Password (must be 6-20 characters in len)
        //verifyPassword("click");
        const body = {
            email: document.getElementById("uid").value,
            password: document.getElementById("password").value,
        };
        const requestOptions = {
            method: 'POST',
            mode: 'cors', // no-cors, *cors, same-origin
            cache: 'no-cache', // *default, no-cache, reload, force-cache, only-if-cached
            credentials: 'include', // include, *same-origin, omit
            body: JSON.stringify(body),
            headers: {
                "content-type": "application/json",
            },
        };

        // URL for Create API
        // Fetch API call to the database to create a new user
        fetch(login_url, requestOptions)
        .then(response => {
            // trap error response from Web API
            if (!response.ok) {
                const errorMsg = 'Login error: ' + response.status;
                console.log(errorMsg);
                return Promise.reject(errorMsg);
            }
            return response.json();
        })
        .then(data => {
            localStorage.setItem("token", data.token);
            window.alert(data.token);
        })
        .catch(error => {
            console.error(error);
        });
    }
</script>