import React from 'react';
import News from '../../styles/Learning/WordLearning.module.css';
import WordLogo from '../../components/Learning/WordLogo';
import Word from '../../components/Learning/Word';
import Usecase from '../../components/Learning/Usecase';
import RelatedNews from '../../components/Learning/RelatedNews';
// import { Link } from 'react-router-dom';

function WordLearning(props) {
  return (
    <div >
        <WordLogo />
        <div className={News.display}>
          <div className={News.font}> Word </div>
        </div>
        <Word />
        <div className={News.display}>
          <div className={News.font}> Usecases </div>
        </div>
        <Usecase />
        <div className={News.displayPlus}>
          <div className={News.displayPlusFont}> Related News </div>
          <div className={News.displayPlusRightFont}>더보기</div>
        </div>
        <RelatedNews />
    </div>
  );
}

export default WordLearning;