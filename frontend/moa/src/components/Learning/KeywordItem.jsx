import React from 'react';
import News from '../../styles/Learning/news.css';

function KeywordItem(props) {
  return (
    <div className='display-middle'>
      <button className='blue-btn'>해양</button>
      <button className='white-btn'>수산</button>
      <button className='white-btn'>건강</button>
    </div>
  );
}

export default KeywordItem;