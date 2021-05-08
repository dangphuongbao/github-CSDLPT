/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_CSDLPT;

import java.awt.Button;

/**
 *
 * @author baobo
 */
public class ModelData {

    String stt, docs, creator, school;
    Button btn;

    public ModelData() {
    }

    public ModelData(String stt, String docs, String creator, String school, Button btn) {
        this.stt = stt;
        this.docs = docs;
        this.creator = creator;
        this.school = school;
        this.btn = btn;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    
}
