console.log("Hello World in js");

var jsonString = '{"name" : "piotr" ,\n' +
    '    "surname" : "kowalski",\n' +
    '    "email" : "test@wp.pl"}'

var obj = JSON.parse(jsonString);

console.log(obj);
console.log("Name is: " + obj.name);

var anotherObject = {
    name: "piotr",
    age: 55,
    email: "test@wp.pl",
    adress: {
        city: "Poznan"
    }
}

console.log(JSON.stringify(anotherObject, null, 2));