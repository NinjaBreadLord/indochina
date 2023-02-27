<script>
    function logout() {
        fetch('http://localhost:8195/deletecookie', {
            method: 'POST',
            credentials: 'include',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                cookieName: 'jwt'
            })
        })
    }

</script>