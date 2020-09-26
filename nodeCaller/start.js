const request = require('request');

function chamar() {
    request('http://springapi:8080/teste', { json: true }, (err, res, body) => {
        if(res)
            console.log(res.statusCode);
    });
}


setInterval(chamar,5000);