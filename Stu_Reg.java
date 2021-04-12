/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LearnerPylonDemoV2;

/**
 *
 * @author Shariar23
 */
public class Stu_Reg {
    
    
    private String name;
    private String f_name;
    private String m_name;
      private String id;
        private String contact_num;
          private String gender;
            private String email;
            private String semester;
            private String s_session;

    public Stu_Reg(String name, String f_name, String m_name, String id, String contact_num, String gender, String email, String semester, String s_session) {
        this.name = name;
        this.f_name = f_name;
        this.m_name = m_name;
        this.id = id;
        this.contact_num = contact_num;
        this.gender = gender;
        this.email = email;
        this.semester = semester;
        this.s_session = s_session;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
            
            

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContact_num() {
        return contact_num;
    }

    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getS_session() {
        return s_session;
    }

    public void setS_session(String s_session) {
        this.s_session = s_session;
    }
    
}
