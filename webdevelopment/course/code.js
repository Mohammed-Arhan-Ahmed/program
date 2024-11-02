function addVideo() {
  var link = document.getElementById("link").value;

  var index = link.lastIndexOf("/");
  var slash = link.substring(index);
  var value = "https://www.youtube.com/embed" + slash;
  var html =
    '<div class="remove"><iframe width="560" height="315" src="' +
    value +
    '" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe><button class= "removebtn"><i class="fa-solid fa-circle-xmark"></i></button></div>';
  var uppervideos = document.getElementById("videos").innerHTML;
  var videos = uppervideos + html;
  document.getElementById("videos").innerHTML = videos;
  database(slash);
}

function database(slash) {
  if (localStorage.length == 0) {
    localStorage.setItem(localStorage.length + 1, slash);
  } else {
    localStorage.setItem(localStorage.length + 1, slash);
  }
}

window.onload = function () {
  for (let i = 1; i <= localStorage.length; i++) {
    var url = localStorage.getItem(i);
    var value = "https://www.youtube.com/embed" + url;
    var html =
      '<div class= "remove"> <iframe width="560" height="315" src="' +
      value +
      '" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe><button class="removebtn"><i class="fa-solid fa-circle-xmark"></i></button></div>';
    var uppervideos = document.getElementById("videos").innerHTML;
    var videos = uppervideos + html;
    document.getElementById("videos").innerHTML = videos;
  }
  if (localStorage.length > 0) {
    document.getElementById("paste").className += " hidden";
  }
};

//function remove
function remove(e){
  console.log("remove called");
  var clickedElement = e.target;

   
  const btnele = Array.from(document.querySelectorAll('.removebtn'));
  console.log(btnele);
  var idx = btnele.indexOf(e.target.parentNode);
  console.log(idx + 1 );
  removeUrl(idx + 1);
  clickedElement.parentNode.style.className += " hiddem"
  setUrl();

  //reload the page after deleteion of videos
  location.reload();

 
 
}
//removeing the video-url from the localstorage
function removeUrl(idx){
  if(idx == -1){
    alert("please reload the page and delete");
  }else{
  localStorage.removeItem(idx);

  console.log("successfully removed");
  }

}
function setUrl(){
  if(localStorage.length > 0){
  const value = localStorage.length;
  var  arr = new Array(value);
  console.log("array length " , arr.length);

  //getting the items
  for(let i = 1;i < value;i++){
    arr[i] = localStorage.getItem(i);
  }

  //removeing the items from localstorage
  for(let i = 1;i < value;i++){
    localStorage.getItem(i);
  }

  //adding again to local storage
  for(let i = 1;i < arr.length;i++){
    localStorage.setItem(i,arr[i]);
  }
}
}

window.addEventListener('load' , () => {
  const btnele = document.querySelectorAll('.removebtn');//we cant set an event listener to the collection of queryselector
 // console.log(btnele);

 //adding event to all buttons 
  btnele.forEach((ele) => {//here ele is a reference varaibel 
    // a simple braclet can make a huge differnece
    
    ele.addEventListener('click' ,remove); //always try to add events at bottom
  });
});

//adding navigation of pages
function changepage(e){
var toAdd = e.target.innerText.toLowerCase();
var address = document.location.href;

var halfadd = address.lastIndexOf('/');
var lastname = address.substring(0,halfadd);//http://127.0.0.1:5500/webdevelopment/course

var newUrl = `http://127.0.0.1:5500/webdevelopment/course/pages/${toAdd}.html`;
document.location.href = newUrl;
}
