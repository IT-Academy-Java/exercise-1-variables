/**
 * 
 */

const name = 'Elena';
const surname1 = 'Piaggio';
const surname2 = 'Valdivieso';
const day = 7;
const month = 11;
const year = 1976;

const leap = 1948;
const yearBetweenLeapYear = 4;

let isLead = false;
const yesItsLeap = `My year of birth is leap`;
const noIsLeap = `My year of birth IS NOT leap`;


const fullName = `${name} ${surname1} ${surname2}`;
const birthDate = `${day} / ${month} / ${year}`

// Fase 1
console.log(`${surname1} ${surname2} ${name}`);
console.log(`${day} / ${month} / ${year}`);

// Fase 2
let cont = 0;
for(let i=leap; i <= year; i++){
    if(i % 4 === 0){
        cont++;
    }
}
console.log(`There are ${cont} leaps.`)

// Fase 3
if(year % 4 === 0){
    isLead = true;
}
if(isLead){
    console.log(yesItsLeap)
} else{
    console.log(noIsLeap);
}

// Fase 4
console.log('\n--- FASE 4 ---');
console.log(fullName)
console.log(birthDate)

if(isLead){
    console.log(yesItsLeap)
} else{
    console.log(noIsLeap);
}
