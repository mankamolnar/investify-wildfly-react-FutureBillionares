export default class MPoolService {
    getPool() {
        let result = new Promise((resolve, reject) => {
            let request = new XMLHttpRequest();
            request.open("GET", "/api/moneypool");
            request.onreadystatechange = () => {
                let raw = request.responseText;
                if (request.readyState==4 && request.status==200) {
                    try {
                        let objectified = JSON.parse(raw);
                        resolve(objectified);
                    } catch(er) {
                        let objectified = JSON.parse(raw.replace("investments", "investments\":\"empty"));
                        resolve(objectified);
                    }
                }
            };
            request.send();
        });
        return result;
    }
}