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