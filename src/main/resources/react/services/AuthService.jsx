export default class AuthService {
    authenticate(username, password) {
        let result = new Promise((resolve, reject) => {
            let request = new XMLHttpRequest();
            request.open("GET", "/api/auth/"+username+"/"+password);
            request.onreadystatechange = () => {
                let raw = request.responseText;

                if (request.readyState==4 && request.status==200) {

                    raw = "{\"loggedIn\":true, \"user\":"+raw+"}";

                } else if (request.readyState == 4 && request.status == 204) {
                    raw = "{\"loggedIn\":false}";

                }

                if (request.readyState==4) {
                    let objectified = JSON.parse(raw);
                    resolve(objectified);
                }
            };
            request.send();
        });
        return result;
    }
}