package main;

import HinhHoc.hinhchunhat;
import HinhHoc.hinhtron;
import HinhHoc.hinhtrutron;
import HinhHoc.hinhvuong;

public class mainclass {
    public static void main(String[] args) {
        
    hinhtron ht = new hinhtron();
    ht.xuatten();
    ht.nhapBankinh();
    ht.tinhChuVi();
    ht.tinhDientich();
    ht.inChuVi();
    ht.inDienTich();

    hinhtrutron htt = new hinhtrutron();
    htt.xuatten();
    htt.nhapChieuCao();
    htt.tinhChuVi();
    htt.tinhDientich();
    htt.tinhTheTich();
    htt.inChuVi();
    htt.inDienTich();
    htt.inTheTich();

    hinhchunhat hcn = new hinhchunhat();
    hcn.xuatten();
    hcn.NhapThongTin();
    hcn.tinhChuVi();
    hcn.tinhDientich();
    hcn.inChuVi();
    hcn.inDienTich();

    hinhvuong hv = new hinhvuong();
    hv.xuatten();
    hv.nhapCanh();
    hv.tinhChuVi();
    hv.tinhDientich();
    hv.inChuVi();
    hv.inDienTich();
}
}
