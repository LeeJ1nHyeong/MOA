import React, { useState, useEffect } from 'react';

import { useSelector } from 'react-redux';

import { diaryApi } from '../../../api/diaryApi';

import { useNavigate } from 'react-router';
import { Link } from 'react-router-dom';

import styles from './ExchangeDiary.module.css'
import AppBar from '../../../components/ETC/AppBar';

import { matchingApi } from '../../../api/matchingApi'

import { WOW } from 'wowjs';
import ConfirmButton from '../../../components/Buttons/ConfirmButton';


function ExchangeDiary(props) {

  const [isBuddyHave, setIsBuddyHave] = useState(null);

  useEffect(() => {
    // wowjs 초기화
    const wow = new WOW();
    wow.init();
  }, []);

  useEffect(() => {
    matchingApi.isMatching()
      .then((response) => {
        console.log(response);
        setIsBuddyHave(response.data.response);
      })
      .catch((error) => {
        console.error(error);
      })

  }, [])

  const navigate = useNavigate();

  return (
    <div className={styles.container}>
      <AppBar></AppBar>


      {isBuddyHave && (
        <>
          <div className={styles.diary + ' wow fadeInUp'}>
            <img
              src='../../../assets/ExchangeDiary/diary_img.png'></img>

            <div className={styles.diaryTitle}>
              <p className={styles.diaryTitleText}>교환일기</p></div>

            <img className={styles.diaryCharacterImg}
              src='../../../assets/ExchangeDiary/diary_character.png'></img>

            <div>
              <Link to="/buddy/exchangediary/content" className={`${styles.button} ${styles.button_view}`}>
                일기 보기
              </Link>
            </div>

            <div>
              <Link to="/buddy/exchangediary/create" className={`${styles.button} ${styles.button_write}`}>
                일기 쓰기
              </Link>
            </div>
          </div>
        </>
      )}

      {!isBuddyHave && (
        <>
          <div className={styles.modalContainer}>
            <img
              className={styles.modalImg}
              src={process.env.PUBLIC_URL + '/assets/Quiz/fail.png'}></img>
            <div className={styles.modalText}>
              버디가 없습니다. <br />
              매칭이 필요해요!
            </div>
          </div>
        </>
      )}




      {/* 검색 필터 */}
      {/* <div>
        <label htmlFor="searchInput">검색 | </label>
        <input type="text" id="searchInput" />
      </div>

      <hr /> */}

      {/* 일기 리스트에 따른 일기 나열 */}
      {/* 같은 날짜일 때 묶어서 component화 해야함 */}
      {/* {diaries.map((diary, index) => {
        const exchangeDiaryId = diary.exchangeDiaryId;

        return (
          <div key={index} onClick={() => handleDiaryClick(exchangeDiaryId)}>
            <DiaryItem
              exchangeDiaryId={exchangeDiaryId}
            />
          </div>
        );
      })}

      <BackButton /> */}
    </div>
  );
}

export default ExchangeDiary;
