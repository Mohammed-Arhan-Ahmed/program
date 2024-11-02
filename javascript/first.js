//function khale{// const obj = {
//     fullname:"arhan",
//     getName:(name) => {
//         console.log(`your name is ${name}`);
//     }
// };

// obj.getName(obj.fullname);
// obj1 = {};


// obj1.__proto__ = obj;
// class demo{
//     constructor(name,type){
//         this.company = name;
//         this.type = type;
//     }
//     printinfo(){
//         console.log(`company name ${this.company} and type ${this.type}`);
//     }
// }
// let dq = new demo('zebronics','harwdware');
// dq.printinfo();


//call back hell
//call back -passing a function in side another function is called callback
//call back hell-a nested functions forming a pyramid structure
// function callId(id,call){
//     setTimeout(() =>{
//         console.log("call id" ,id);
//         if(call){
//             call();
//         }
//     },2000);
// }
// //callId(7,callId(8));-this code causes calling of function all
//at once so we want calling of function after to 2 seconds
//getid
//2s
//getid
//2s
// callId(2,() =>{
//     callId(3,() =>{
//         callId(4);
//     });
// });
// callId(3,()=>{
//     console.log("calling 4");
                                    //this code is not efficetevely iunderstand
                                    //it called call back hell
                                    
//     callId(4,()=>{
//         console.log("calling 5");
//         callId(5);
//     });
// });

//to  OVER COME THE PROBLEM OF CALLBACK HELL WE USE 
//A NEW CONCEPT CALLED PROMISES
// const promise = new Promise((resolve,reject) =>{
//     console.log("promise created ..");
//    // reject("error");//return - the promise will return from this and not invoke the next one
//     resolve("success");
   
// });
//}
function getData(data){
    //settime for 5s
    return new Promise((resolve,reject) => {
        console.log("promise created..");
        if(data){
        resolve("data returned");
       
        
    }else{
        reject("data not found");
    }

    })

}
//how to print promise state?
let value = getData(5);
value.then((res) => {
 console.log("successfully get the data",res);
})
.catch((err) =>{
    console.log("data not found",err);
})

//PROMISE CHAINING
//solving callback hell with promise cahining
// let result = getData(5);

// result.then(()=>{
//     console.log(result);
//     console.log("enter pass");
//     // getData(8).the(()=>{
//     //     console.log("account found plz login");
//     // });
// })
// .catch(()=>{
//     console.log("error occured");
// })






