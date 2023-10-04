import React from "react";

const koreanBuddyStyle = {
  display: 'flex',
  flexDirection: 'column',
  padding: '10px 30px',
};

const introCommentStyle = {
  textAlign: 'left',
  fontSize: '24px',
  fontWeight: '700',
  marginBottom: '180px',
};

const selectOptionContainerStyle = {
  textAlign: 'left',
  fontSize: '28px',
  marginBottom: '220px',
};

const selectBoxStyle = {
  background: 'transparent',
  fontSize: '18px',
  fontWeight: '500',
  borderBottom: '1px solid #92BB69', // 밑줄 스타일
  borderLeft: 'none',
  borderRight: 'none',
  borderTop: 'none',
  // margin: '10px auto',
  height: '30px',
};

const topCommentStyle = {
  display: 'flex',
  alignItems: 'center',
};

function KoreanBuddy(){
  return(
    <div style={koreanBuddyStyle}>
      <div style={introCommentStyle}>
        <span>
          버디에게 묻는다...
          <br />
          니 어데서 왔노...
        </span>
      </div>
      <div style={selectOptionContainerStyle}>
        <div style={topCommentStyle}>
          <select style={selectBoxStyle}>
            <option value="미국">미국</option>
            <option value="일본">일본</option>
            <option value="중국">중국</option>
            <option value="영국">영국</option>
          </select>
          <span>에서 온</span>
        </div>
        <div>
          <span>버디를 만나볼래요!</span>
        </div>
      </div>
    </div>
  );
};

export default KoreanBuddy;