window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}


var mobile,otp_btn,otp_box,otp,otp_sbm;
function getAllElements(){
	mobile = document.getElementById("mobile");
	otp_btn = document.getElementById("otp_btn");
	otp_box = document.getElementById("otp_box");
	otp = document.getElementById("otp");
	otp_sbm = document.getElementById("otp_sbm");
}

function setAllActions(){
	otp_btn.onclick = sendOtp;
	otp_sbm.onclick = mobileVerification;
}

function mobileVerification(){
	alert('abc')
}

function sendOtp(){
	otp_box.style.visibility = 'visible';
	otp_btn.style.backgroundColor = '#7c7569';


}