package com.multifin.realty.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.multifin.api.StockPriceAPI;
import com.multifin.realty.api.APTDetailAPI;
import com.multifin.realty.model.service.APTDetailService;
import com.multifin.realty.model.vo.APTDetail;

public class APTDetailController {
	private APTDetailService aptDetailService = new APTDetailService();
	// APTDetail 테이블 초기화
	public void initAPTDetail() {
		Calendar cal = new GregorianCalendar(2022, 0, 1); // 2022년 6월 1일
		Calendar today = Calendar.getInstance();
		

			System.out.println(cal.getTime()); // 현재 날짜
			// 현재 날짜에 해당하는 데이터 페이지 수 구하기
			int endPage = APTDetailAPI.getPageNum(cal.getTime());
			// 데이터 불러오기
			for (int i = 1; i <= endPage; i++) {
				List<APTDetail> list = APTDetailAPI.parsing(cal.getTime(), i);
				// 가져온 리스트가 아무것도 없으면 다시 반복
				if (list == null || list.isEmpty()) {
					continue;
				}
				// 가져온 데이터를 DB에 저장
				for (APTDetail sp : list) {
					aptDetailService.insert(sp);
				}
			}
		
			
		
		
	}
	
	public static void main(String[] args) {
		APTDetailController controller = new APTDetailController();
		controller.initAPTDetail();
		System.out.println("APTDetail Table 초기화 완료.");
	}
}
