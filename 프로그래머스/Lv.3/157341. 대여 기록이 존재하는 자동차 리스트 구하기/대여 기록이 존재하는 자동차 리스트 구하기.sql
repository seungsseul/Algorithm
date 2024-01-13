-- 코드를 입력하세요
SELECT C.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR C JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY RH ON C.CAR_ID=RH.CAR_ID
WHERE C.CAR_TYPE='세단' && DATE_FORMAT(RH.START_DATE, "%m")=10
GROUP BY C.CAR_ID
ORDER BY C.CAR_ID DESC