var myHeading = document.querySelector('h1');
myHeading.textContent = 'Hello world!';


document.querySelector('img').onclick = function() {
    alert('To obrazek! Przycisk do przełączenia zdjęcia jest niżej.');
}

var myImage = document.querySelector('img');

function funkcja_zd() {
    var mySrc = myImage.getAttribute('src');
    if(mySrc === 'images/home-icon.png') {
      myImage.setAttribute ('src','images/ninja-icon.png');
    } else {
      myImage.setAttribute ('src','images/home-icon.png');
    }
}
function addEndText(){
	var x = document.createElement('p');
	x.innerText="tworze tekst";
	document.body.appendChild(x);
	x.classList.add('text-uppercase');
	x.style.color = 'yellow';
}

function addNaglowek(){
  var h1 = document.createElement('h1');
  h1.innerText="naglowek";
  document.body.insertBefore(h1,document.body.firstChild);
  h1.style.fontFamily = 'Brush Script MT';
}