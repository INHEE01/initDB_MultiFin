package com.multifin.realty.model.vo;
//APT 분양정보 상세조회
public class APTDetail {
	private int aptDno;
	private String bsns_mby_nm;             //사업주체명 (시행사)                                         
    private String cnstrct_entrps_nm;         //건설업체명 (시공사)                                             
    private String cntrct_cncls_bgnde;         //계약시작일                                             
    private String cntrct_cncls_endde;               //계약종료일                                       
    private String gnrl_rnk1_crsparea_rcept_pd; //1순위 접수일 해당지역                                                     
    private String gnrl_rnk1_etc_area_rcptde_pd;   //1순위 접수일 경기지역                                                   
    private String gnrl_rnk1_etc_gg_rcptde_pd;      //1순위 접수일 기타지역                                                
//    private String GNRL_RNK2_CRSPAREA_RCEPT_PD;     //2순위 접수일 해당지역                                                 
//    private String GNRL_RNK2_ETC_AREA_RCPTDE_PD;     //2순위 접수일 경기지역                                                 
//    private String GNRL_RNK2_ETC_GG_RCPTDE_PD;       //2순위 접수일 기타지역                                               
    private String hmpg_adres;          			//홈페이지주소                                            
//    private String HOUSE_DTL_SECD;      		//주택상세구분코드                                                
    private String house_dtl_secd_nm;     			 //주택상세구분코드명                                                
    private int house_manage_no;  					//주택관리번호                                                    
    private String house_nm;							//주택명                                                      
//    private String HOUSE_SECD;   					//주택구분코드                                                   
    private String house_secd_nm;        //주택구분코드명                                              
    private String hssply_adres;          //공급위치                                            
    private String hssply_zip;      //공급위치 우편번호                                                
//    private String IMPRMN_BSNS_AT;          //정비사업                                            
//    private String LRSCL_BLDLND_AT;       //대규모 택지개발지구                                               
//    private String MDAT_TRGET_AREA_SECD;   //조정대상지역                                                   
    private String mdhs_telno;       //문의처                                               
    private String mvn_prearnge_ym;  //입주예정월                                                    
    private String npln_prvopr_public_house_at;   //수도권 내 민영 공공주택지구                                                   
    private String parcprc_uls_at;    		//분양가상한제                                                  
    private int pblanc_no;				//공고번호
    private String pblanc_url;			//분양정보 URL
    private String przwner_presnatn_de;			//당첨자발표일
    private String public_house_earth_at;		//공공주택지구
    private String rcept_bgnde;				//청약접수시작일
    private String rcept_endde;					//청약접수종료일
    private String rcrit_pblanc_de;				//모집공고일
//    private String RENT_SECD;					//분양구분코드
    private String rent_secd_nm;				//분양구분코드명
    private String speclt_rdn_earth_at;			//투기과열지구
    private String spsply_rcept_bgnde;			//특별공급 접수시작일
    private String spsply_rcept_endde;			//특별공급 접수종료일
//    private String SUBSCRPT_AREA_CODE;			//공급지역코드
    private String subscrpt_area_code_nm;			//공급지역명
    private int tot_suply_hshldco;			//공급규모
	public APTDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public APTDetail(int aptDno, String bsns_mby_nm, String cnstrct_entrps_nm, String cntrct_cncls_bgnde,
			String cntrct_cncls_endde, String gnrl_rnk1_crsparea_rcept_pd, String gnrl_rnk1_etc_area_rcptde_pd,
			String gnrl_rnk1_etc_gg_rcptde_pd, String hmpg_adres, String house_dtl_secd_nm, int house_manage_no,
			String house_nm, String house_secd_nm, String hssply_adres, String hssply_zip, String mdhs_telno,
			String mvn_prearnge_ym, String npln_prvopr_public_house_at, String parcprc_uls_at, int pblanc_no,
			String pblanc_url, String przwner_presnatn_de, String public_house_earth_at, String rcept_bgnde,
			String rcept_endde, String rcrit_pblanc_de, String rent_secd_nm, String speclt_rdn_earth_at,
			String spsply_rcept_bgnde, String spsply_rcept_endde, String subscrpt_area_code_nm, int tot_suply_hshldco) {
		super();
		this.aptDno = aptDno;
		this.bsns_mby_nm = bsns_mby_nm;
		this.cnstrct_entrps_nm = cnstrct_entrps_nm;
		this.cntrct_cncls_bgnde = cntrct_cncls_bgnde;
		this.cntrct_cncls_endde = cntrct_cncls_endde;
		this.gnrl_rnk1_crsparea_rcept_pd = gnrl_rnk1_crsparea_rcept_pd;
		this.gnrl_rnk1_etc_area_rcptde_pd = gnrl_rnk1_etc_area_rcptde_pd;
		this.gnrl_rnk1_etc_gg_rcptde_pd = gnrl_rnk1_etc_gg_rcptde_pd;
		this.hmpg_adres = hmpg_adres;
		this.house_dtl_secd_nm = house_dtl_secd_nm;
		this.house_manage_no = house_manage_no;
		this.house_nm = house_nm;
		this.house_secd_nm = house_secd_nm;
		this.hssply_adres = hssply_adres;
		this.hssply_zip = hssply_zip;
		this.mdhs_telno = mdhs_telno;
		this.mvn_prearnge_ym = mvn_prearnge_ym;
		this.npln_prvopr_public_house_at = npln_prvopr_public_house_at;
		this.parcprc_uls_at = parcprc_uls_at;
		this.pblanc_no = pblanc_no;
		this.pblanc_url = pblanc_url;
		this.przwner_presnatn_de = przwner_presnatn_de;
		this.public_house_earth_at = public_house_earth_at;
		this.rcept_bgnde = rcept_bgnde;
		this.rcept_endde = rcept_endde;
		this.rcrit_pblanc_de = rcrit_pblanc_de;
		this.rent_secd_nm = rent_secd_nm;
		this.speclt_rdn_earth_at = speclt_rdn_earth_at;
		this.spsply_rcept_bgnde = spsply_rcept_bgnde;
		this.spsply_rcept_endde = spsply_rcept_endde;
		this.subscrpt_area_code_nm = subscrpt_area_code_nm;
		this.tot_suply_hshldco = tot_suply_hshldco;
	}
	@Override
	public String toString() {
		return "APTDetail [aptDno=" + aptDno + ", bsns_mby_nm=" + bsns_mby_nm + ", cnstrct_entrps_nm="
				+ cnstrct_entrps_nm + ", cntrct_cncls_bgnde=" + cntrct_cncls_bgnde + ", cntrct_cncls_endde="
				+ cntrct_cncls_endde + ", gnrl_rnk1_crsparea_rcept_pd=" + gnrl_rnk1_crsparea_rcept_pd
				+ ", gnrl_rnk1_etc_area_rcptde_pd=" + gnrl_rnk1_etc_area_rcptde_pd + ", gnrl_rnk1_etc_gg_rcptde_pd="
				+ gnrl_rnk1_etc_gg_rcptde_pd + ", hmpg_adres=" + hmpg_adres + ", house_dtl_secd_nm=" + house_dtl_secd_nm
				+ ", house_manage_no=" + house_manage_no + ", house_nm=" + house_nm + ", house_secd_nm=" + house_secd_nm
				+ ", hssply_adres=" + hssply_adres + ", hssply_zip=" + hssply_zip + ", mdhs_telno=" + mdhs_telno
				+ ", mvn_prearnge_ym=" + mvn_prearnge_ym + ", npln_prvopr_public_house_at="
				+ npln_prvopr_public_house_at + ", parcprc_uls_at=" + parcprc_uls_at + ", pblanc_no=" + pblanc_no
				+ ", pblanc_url=" + pblanc_url + ", przwner_presnatn_de=" + przwner_presnatn_de
				+ ", public_house_earth_at=" + public_house_earth_at + ", rcept_bgnde=" + rcept_bgnde + ", rcept_endde="
				+ rcept_endde + ", rcrit_pblanc_de=" + rcrit_pblanc_de + ", rent_secd_nm=" + rent_secd_nm
				+ ", speclt_rdn_earth_at=" + speclt_rdn_earth_at + ", spsply_rcept_bgnde=" + spsply_rcept_bgnde
				+ ", spsply_rcept_endde=" + spsply_rcept_endde + ", subscrpt_area_code_nm=" + subscrpt_area_code_nm
				+ ", tot_suply_hshldco=" + tot_suply_hshldco + "]";
	}
	public int getAptDno() {
		return aptDno;
	}
	public void setAptDno(int aptDno) {
		this.aptDno = aptDno;
	}
	public String getBsns_mby_nm() {
		return bsns_mby_nm;
	}
	public void setBsns_mby_nm(String bsns_mby_nm) {
		this.bsns_mby_nm = bsns_mby_nm;
	}
	public String getCnstrct_entrps_nm() {
		return cnstrct_entrps_nm;
	}
	public void setCnstrct_entrps_nm(String cnstrct_entrps_nm) {
		this.cnstrct_entrps_nm = cnstrct_entrps_nm;
	}
	public String getCntrct_cncls_bgnde() {
		return cntrct_cncls_bgnde;
	}
	public void setCntrct_cncls_bgnde(String cntrct_cncls_bgnde) {
		this.cntrct_cncls_bgnde = cntrct_cncls_bgnde;
	}
	public String getCntrct_cncls_endde() {
		return cntrct_cncls_endde;
	}
	public void setCntrct_cncls_endde(String cntrct_cncls_endde) {
		this.cntrct_cncls_endde = cntrct_cncls_endde;
	}
	public String getGnrl_rnk1_crsparea_rcept_pd() {
		return gnrl_rnk1_crsparea_rcept_pd;
	}
	public void setGnrl_rnk1_crsparea_rcept_pd(String gnrl_rnk1_crsparea_rcept_pd) {
		this.gnrl_rnk1_crsparea_rcept_pd = gnrl_rnk1_crsparea_rcept_pd;
	}
	public String getGnrl_rnk1_etc_area_rcptde_pd() {
		return gnrl_rnk1_etc_area_rcptde_pd;
	}
	public void setGnrl_rnk1_etc_area_rcptde_pd(String gnrl_rnk1_etc_area_rcptde_pd) {
		this.gnrl_rnk1_etc_area_rcptde_pd = gnrl_rnk1_etc_area_rcptde_pd;
	}
	public String getGnrl_rnk1_etc_gg_rcptde_pd() {
		return gnrl_rnk1_etc_gg_rcptde_pd;
	}
	public void setGnrl_rnk1_etc_gg_rcptde_pd(String gnrl_rnk1_etc_gg_rcptde_pd) {
		this.gnrl_rnk1_etc_gg_rcptde_pd = gnrl_rnk1_etc_gg_rcptde_pd;
	}
	public String getHmpg_adres() {
		return hmpg_adres;
	}
	public void setHmpg_adres(String hmpg_adres) {
		this.hmpg_adres = hmpg_adres;
	}
	public String getHouse_dtl_secd_nm() {
		return house_dtl_secd_nm;
	}
	public void setHouse_dtl_secd_nm(String house_dtl_secd_nm) {
		this.house_dtl_secd_nm = house_dtl_secd_nm;
	}
	public int getHouse_manage_no() {
		return house_manage_no;
	}
	public void setHouse_manage_no(int house_manage_no) {
		this.house_manage_no = house_manage_no;
	}
	public String getHouse_nm() {
		return house_nm;
	}
	public void setHouse_nm(String house_nm) {
		this.house_nm = house_nm;
	}
	public String getHouse_secd_nm() {
		return house_secd_nm;
	}
	public void setHouse_secd_nm(String house_secd_nm) {
		this.house_secd_nm = house_secd_nm;
	}
	public String getHssply_adres() {
		return hssply_adres;
	}
	public void setHssply_adres(String hssply_adres) {
		this.hssply_adres = hssply_adres;
	}
	public String getHssply_zip() {
		return hssply_zip;
	}
	public void setHssply_zip(String hssply_zip) {
		this.hssply_zip = hssply_zip;
	}
	public String getMdhs_telno() {
		return mdhs_telno;
	}
	public void setMdhs_telno(String mdhs_telno) {
		this.mdhs_telno = mdhs_telno;
	}
	public String getMvn_prearnge_ym() {
		return mvn_prearnge_ym;
	}
	public void setMvn_prearnge_ym(String mvn_prearnge_ym) {
		this.mvn_prearnge_ym = mvn_prearnge_ym;
	}
	public String getNpln_prvopr_public_house_at() {
		return npln_prvopr_public_house_at;
	}
	public void setNpln_prvopr_public_house_at(String npln_prvopr_public_house_at) {
		this.npln_prvopr_public_house_at = npln_prvopr_public_house_at;
	}
	public String getParcprc_uls_at() {
		return parcprc_uls_at;
	}
	public void setParcprc_uls_at(String parcprc_uls_at) {
		this.parcprc_uls_at = parcprc_uls_at;
	}
	public int getPblanc_no() {
		return pblanc_no;
	}
	public void setPblanc_no(int pblanc_no) {
		this.pblanc_no = pblanc_no;
	}
	public String getPblanc_url() {
		return pblanc_url;
	}
	public void setPblanc_url(String pblanc_url) {
		this.pblanc_url = pblanc_url;
	}
	public String getPrzwner_presnatn_de() {
		return przwner_presnatn_de;
	}
	public void setPrzwner_presnatn_de(String przwner_presnatn_de) {
		this.przwner_presnatn_de = przwner_presnatn_de;
	}
	public String getPublic_house_earth_at() {
		return public_house_earth_at;
	}
	public void setPublic_house_earth_at(String public_house_earth_at) {
		this.public_house_earth_at = public_house_earth_at;
	}
	public String getRcept_bgnde() {
		return rcept_bgnde;
	}
	public void setRcept_bgnde(String rcept_bgnde) {
		this.rcept_bgnde = rcept_bgnde;
	}
	public String getRcept_endde() {
		return rcept_endde;
	}
	public void setRcept_endde(String rcept_endde) {
		this.rcept_endde = rcept_endde;
	}
	public String getRcrit_pblanc_de() {
		return rcrit_pblanc_de;
	}
	public void setRcrit_pblanc_de(String rcrit_pblanc_de) {
		this.rcrit_pblanc_de = rcrit_pblanc_de;
	}
	public String getRent_secd_nm() {
		return rent_secd_nm;
	}
	public void setRent_secd_nm(String rent_secd_nm) {
		this.rent_secd_nm = rent_secd_nm;
	}
	public String getSpeclt_rdn_earth_at() {
		return speclt_rdn_earth_at;
	}
	public void setSpeclt_rdn_earth_at(String speclt_rdn_earth_at) {
		this.speclt_rdn_earth_at = speclt_rdn_earth_at;
	}
	public String getSpsply_rcept_bgnde() {
		return spsply_rcept_bgnde;
	}
	public void setSpsply_rcept_bgnde(String spsply_rcept_bgnde) {
		this.spsply_rcept_bgnde = spsply_rcept_bgnde;
	}
	public String getSpsply_rcept_endde() {
		return spsply_rcept_endde;
	}
	public void setSpsply_rcept_endde(String spsply_rcept_endde) {
		this.spsply_rcept_endde = spsply_rcept_endde;
	}
	public String getSubscrpt_area_code_nm() {
		return subscrpt_area_code_nm;
	}
	public void setSubscrpt_area_code_nm(String subscrpt_area_code_nm) {
		this.subscrpt_area_code_nm = subscrpt_area_code_nm;
	}
	public int getTot_suply_hshldco() {
		return tot_suply_hshldco;
	}
	public void setTot_suply_hshldco(int tot_suply_hshldco) {
		this.tot_suply_hshldco = tot_suply_hshldco;
	}
	
    
	

	
    
    
    
    
	
    
}
