export default class RegistrationService {
    registrate(username, password, password2, email) {
        let result = new Promise((resolve, reject) => {

            let request = new XMLHttpRequest();
            request.open("GET", "/api/registration");
            request.onreadystatechange = () => {

                let raw = request.responseText;
                if (request.readyState==4 && request.status==200) {
                    let objectified = JSON.parse(raw);
                    resolve(objectified);
                }

            }

            request.send();
        });
        return result;
    }
}