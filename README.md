## 프로젝트소개

- 프로젝트명: MovieLog(영화추천 사이트)
  
- 개발기간: 2024.12.01 ~ 2024.12.30


## 기술 스택
![Image](https://github.com/user-attachments/assets/6b854f12-ee27-4e6c-a0df-dbf9b0c45706)

## ERD
![Image](https://github.com/user-attachments/assets/5e9c93f2-ca81-4d55-baa6-6f488f2241cd)

## 프로젝트 구성

<details>
<summary>메인 홈페이지</summary>  
  
![Image](https://github.com/user-attachments/assets/d84c352f-ecc6-4cf8-8c1e-2a8b2f827fa6)

</details>

<details>
<summary>로그인 & 회원가입</summary>  
  
![Image](https://github.com/user-attachments/assets/35342d69-f94c-48e9-bfce-5d2d9ef7b344)

</details>

<details>
  <summary>추천 영화 페이지</summary>
  
  ![Image](https://github.com/user-attachments/assets/5006c10c-8a0d-47c7-815b-736aaa13984f)
  
</details>


## 구현기능
**1. MySQL과 Spring Boot를 활용한 회원관리 및 영화 추천 기능 구현**
  - **기술:** MySQL, Spring Boot
  - **내용:** 회원가입 및 로그인 기능 구현과 함께, 회원가입 시 사용자가 선택한 선호 장르를 기반으로 맞춤형 영화 추천 페이지 제작.
  - **성능 개선:** 계층별로 기능을 분리하여 코드의 유지보수성과 확장성을 높임.
    
**2. 영화진흥위원회 API와 TMDB API를 활용한 영화 정보 제공**
  - **기술:** REST API, JSON
  - **내용:** 영화진흥위원회 API를 통해 박스오피스 순위를 가져오고, TMDB API를 활용해 영화 정보 및 포스터를 표시.
  - **성능 개선:** 여러 API를 동시에 연동하여 데이터를 효율적으로 처리하고 사용자에게 풍부한 콘텐츠 제공.
    
**3. CSS와 부트스트랩을 활용한 반응형 웹 디자인 적용**
  - **기술:** CSS, Bootstrap
  - **내용:** 사용자 경험(UX)을 개선하기 위해 데스크톱 환경에서 최적화된 UI를 제작.
  - **성능 개선:** 반응형 디자인으로 다양한 기기에서 일관성 있는 사용자 경험 제공
    
**4. API 연동을 기반으로 한 동적 데이터 표시**
 - **기술:** JavaScript, AJAX
 - **내용:** 실시간으로 API 데이터를 가져와 영화 목록을 동적으로 업데이트하고 추천 페이지에서 사용자가 선택한 선호 장르를 기반으로 영화 데이터를 표시.
 - **성능 개선:** API 데이터를 비동기로 처리하여 페이지 로딩 시간을 줄이고 사용자 편의성을 높임.

## 특이사항
**1. 개인 프로젝트 진행**
  - 이번 프로젝트는 개인적으로 진행했으며, API 연동과 데이터 처리에 집중하여 프로젝트를 완성.
  - 여러 API를 동시에 활용하면서 데이터 구조의 차이를 조정하고, 요청 속도를 최적화하며 성공적으로 통합함.
    
**2. 고민 & 문제 해결 포인트**
- **API 연동의 복잡성 해결:** 영화진흥위원회 API와 TMDB API의 데이터를 조합하는 과정에서 데이터 형식과 응답 속도의 차이를 해결하기 위해 추가적인 JSON 처리 로직을 구현.
    
- **Spring Boot 계층 분리 학습 및 적용:** 프로젝트 구조를 DTO, Entity, Repository, Service, Controller로 분리하면서 코드의 유지보수성을 높이고 효율적인 설계를 구현함.
    
**3. 추가로 개발중인/개선 중인 사항**

- **추가 API 연동 계획:** 영화 추천 기능을 강화하기 위해 새로운 API를 탐색 중이며, 사용자 리뷰 및 평점 기능 추가를 계획 중임.

