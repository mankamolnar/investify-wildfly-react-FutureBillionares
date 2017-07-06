export default class AuthService {
    authenticate(username, password) {
        let result = new Promise((resolve, reject) => {
            let request = new XMLHttpRequest();
            request.open("GET", "/api/auth/"+username+"/"+password);
            request.onreadystatechange = () => {
                let raw = request.responseText;
                console.log(raw);
                if (request.readyState==4 && request.status==200) {
                    let objectified = JSON.parse(raw);
                    resolve(objectified);
                }
            };
            request.send();
        });
        return result;
    }
}