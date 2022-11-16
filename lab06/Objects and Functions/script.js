let car={
    color: "black",
};
console.log(car);

car.color="green";
console.log(car);

car.power=function(power){
    console.log("\n"+"The engine power = ",power);
}
car.power(120);

let sum=function(pears,apples){
    return pears+apples;
}
console.log("\n"+"sum: "+sum(3,4));

let paymentTerminal={
    name: "Lera",
};

let defineName=function(name){
    if (name==paymentTerminal.name){
        console.log("\n"+"Hello, "+name);
    }
    else console.log("\n"+"Invalid name");
}
defineName("Lera");
defineName("Vika");
console.log("\n");

let calculating=function(argument){
    console.log(typeof(argument));
}
calculating(true);
calculating(67);
calculating(NaN);
calculating("string");

let primeNumber=function(number){
    let i=2;
    while (i<number){
        if (number%i === 0){
            return ("Composite number");
        }
        i+=1;
    }
    return ("Prime number");
}
console.log(primeNumber(23));
console.log(primeNumber(30));
console.log(primeNumber(35));