package spring;

public class MemberPrinter {

    public void print(Member member) {
        System.out.printf(
                "회원 정보 : id=%d, email=%s, name=%s, createDate=%tF\n" ,
                member.getId(),member.getEmail(),member.getName(),member.getRegisterDateTime()
        );
    }
}
