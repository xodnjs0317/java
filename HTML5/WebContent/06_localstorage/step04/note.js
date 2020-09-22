/**
 * 문제점 : 
 * 1. 키가 중복이 발생할수 있다. 
 *  -  시간을 이용해서 고유값을 만들어서 해결.
 * 2. 어플리케이션(메모)와 관련이 없는 데이터를 너무 많이 조회하는 문제가 생길수 있습니다.
 * 	-  localStorage 안에 메모의 키값을 관리하는 배열을 별도로 생성해서 배열만 조회
 */
window.onload = function() {
	var addBtn = document.getElementById("add_button");
	addBtn.onclick = createSticky;
	
	var stArr = getStArr();
	for(var i =0;i<stArr.length;i++){
		var key = stArr[i];
		addToDom(key,localStorage.getItem(key));
	}
};
function getStArr() {
	var stickyArr = localStorage.getItem("stickyArr");
	if(!stickyArr){
		stickyArr = [];
		//로컬스토리지에 배열을 직접 넣을수 없습니다. 
		//배열의 내용을 문자열로 변경후에 입력하면 배열을 입력할 수 있습니다. 
		
		localStorage.setItem("stickyArr", JSON.stringify(stickyArr));
		//JSON.stringify() -> 데이터 객체를 문자열로 변환해주는 함수	
		
		//JSON (JavaScript Object Notation)
		//자바 스크립트의 객체 표기법을 제한하여 만든 문자 기반의 데이터 교환 포맷 
		//"키값과 밸류값" 쌍으로 이루어진 데이터 오브젝트를 전달하기 위해서 인간이 
		//읽을수 있는 텍스트를 사용하는 개방형 표준 포맷입니다. 
	}else {
		stickyArr = JSON.parse(stickyArr);
		 //JSON.parse() -> 문자열을 데이터 객체로 변환
	}
	return stickyArr;
}
function createSticky() {
	var text = document.getElementById("note_text").value;
	var cDate = new Date();
	var key = "sticky" + cDate.getTime();
	
	var stArr = getStArr();
	stArr.push(key);
	
	localStorage.setItem("stickyArr", JSON.stringify(stArr));
	
	localStorage.setItem(key,text);
	addToDom(key,text);
}
function addToDom(key,text){
	var stickies = document.getElementById("stickies");
	//stickies.innerHTML += 
	//	"<li> <span class='sticky'>"+text+"</span></li>";
	
	var sticky = document.createElement("li");
	sticky.setAttribute("id", key);
	var span = document.createElement("span");
	span.setAttribute("class","sticky");
	span.innerHTML = text;
	sticky.appendChild(span);
	stickies.appendChild(sticky);
	
	sticky.onclick = delSticky;
		
	
}


function delSticky(event){
	var key = event.target.id;
	console.log(event.target.nodeName);
	console.log(event.target.tagName);
	
	if(event.target.nodeName=="SPAN"){
		key = event.target.parentNode.id;
	}
	console.log("삭제할 키 : " +key);
	
	//1번 작업 : 키에 해당하는 아이템을 localStorage에서 삭제
	localStorage.removeItem(key);
	
	//2번 작업 : 키를 모아 놓은 배열에서 삭제 
	var stArr = getStArr();
	for(var i=0;i<stArr.length;i++){
		if(key==stArr[i]){
			stArr.splice(i,1);//배열에서 원하는 인덱스를 삭제 
			break;
		}
	}localStorage.setItem("stickyArr", JSON.stringify(stArr));
	
	//3번 작업 : 화면에서 key 값을 id 속성에 할당한 li 태그를 삭제
	var li = document.getElementById(key);
	li.parentNode.removeChild(li);
}





