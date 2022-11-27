

// 선호장르 체크 여부 검사, 최대 2개까지 체크 가능
function count_check(obj) {
  let chkBox = document.getElementsByName("check1"); // name값 불러옴
  let chkCnt = 0; // chkCnt 변수에 초깃값을 0으로 설정
  for(let i=0; i<chkBox.length; i++) { // 반복문
    if(chkBox[i].checked) { // 조건문으로 chkBox가 checked됐을 경우
      chkCnt++; // 1씩 증가
    }
  }
  if(chkCnt>2) {
    alert("최대 2개까지 선택할 수 있습니다.");
    obj.checked = false;
    return false;
  }
}

// 종사 분야 체크 여부 검사, 최대 3개까지 체크 가능
function count_check2(obj) {
  let chkBox = document.getElementsByName("check2");
  let chkCnt = 0;
  for(let i=0; i<chkBox.length; i++) { 
    if(chkBox[i].checked) { 
      chkCnt++;
    }
  }
  if(chkCnt>3) {
    alert("최대 3개까지 선택할 수 있습니다.");
    obj.checked = false;
    return false;
  }
}


//  매칭버튼 클릭 시 발생하는 이벤트
//  1. 종사분야, 선호장르 각 1과목 이상 체크해야 매칭이 시작됨
function match() {
  let chk1 = document.getElementsByName("check1"); // name="check1" 값 불러옴
  let chk2 = document.getElementsByName("check2"); // name="check2" 값 불러옴
  let chkCnt1 = 0;
  let chkCnt2 = 0;
  for(let i=0; i<5; i++) { 
    if(chk1[i].checked) {
      chkCnt1++;
    }
    if(chk2[i].checked) {
      chkCnt2++;
    }
  } 
  // 1. 체크 여부 검사
  if(chkCnt1 < 1 || chkCnt2 < 1) {
  alert("종사 분야와 선호 장르를 1개 이상 선택하십시오.");
  } 
  if(chkCnt1 >= 1 && chkCnt2 >= 1) {
    alert("매칭을 시작합니다!");
  }
}