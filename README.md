# SW-
퍼스널 컬러에 따른 개개인의 톤을 머신러닝을 통해 추출하고, 입술 추적 및 텍스처 합성을 통해 본인의 입술에 추천된 톤을 적용.

1. real-time-lip-landmark에 들어가 해당 파이썬 코드를 아래와 같이 실행.
   1) pip install imutils
   2) python video_lip_landmarks.py --shape-predictor shape_predictor_68_face_landmarks.dat
   
   *작동 원리
   Shape_predictor_68_face_landmarks.dat에서 총 1 ~ 68개의 얼굴추적 랜드마크 중 입술 부위에 해당하는 49 ~ 68번 점을 추적하여 텍스처 
   
