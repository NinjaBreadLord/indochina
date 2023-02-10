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
    // URL for deployment
    // var url = "https://spring.nighthawkcodingsociety.com"
    // Comment out next line for local testing
    url = "http://localhost:8195"
    // Authenticate endpoint
    const login_url = url + '/authenticate';


    function login_user(){
        // Set body to include login data
        const body = {
            email: document.getElementById("uid").value,
            password: document.getElementById("password").value,
        };

        // Set Headers to support cross origin
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

        // Fetch JWT
        fetch(login_url, requestOptions)
            .then(response => {
                // trap error response from Web API
                if (!response.ok) {
                const errorMsg = 'Login error: ' + response.status;
                console.log(errorMsg);
                return;
                }
                // Success!!!
                return response.json();
            })
            .then(data => {
                localStorage.setItem("jwt", data.jwt);
            })
            .catch(error => {
                console.error("Error parsing JSON response: ", error);
            });
    }