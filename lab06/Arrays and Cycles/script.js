let movies=["Spiderman", "Batman", "Knives out"];
movies.forEach(element => {
    console.log(element);
});

let carManyfactures=["Volkswagen", "Kia", "Audi"];
let string=String(carManyfactures);
console.log("\n"+Array(string)+"\n");

let names=["Vika", "Andrey", "Egor"];
names.forEach(element=>{
    console.log(element.concat(", hello"));
})

console.log("\n");
let numericArray=[0,1,1,0];
numericArray.forEach(element=>{
    console.log(Boolean(element));
})

let descendingArray=[1,6,7,8,3,4,5,6];
console.log(descendingArray.sort((a,b)=>parseFloat(b)-parseFloat(a)));

let filterArray=[1,6,7,8,3,4,5,6];
console.log(filterArray.filter(v=>v>3));

let findNumber=function(array, number){
    array.forEach((element, i)=>{
        if(element==number){
            console.log(`\n${i}\n`);
        }
    })
}
findNumber(filterArray, 5);

for(let a=13; a>=10; a--){
    console.log(a);
}

console.log('\n');
let primeNumber=function(number){
    prime: for (let i=2; i<=number; i++){
        for (let j=2; j<i; j++){
            if(i%j==0) continue prime;
        } 
        console.log(i);
    }
}
primeNumber(10);

console.log('\n');
for (let oddNumbers=0; oddNumbers<10; oddNumbers++){
    if (oddNumbers%2!==0){
        console.log(oddNumbers);
    }
}