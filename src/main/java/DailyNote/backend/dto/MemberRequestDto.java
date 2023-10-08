package DailyNote.backend.dto;

import DailyNote.backend.domain.member.Member;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MemberRequestDto {
    public String getEmail() {
    }

    public Member toMember(PasswordEncoder passwordEncoder) {
    }

    public UsernamePasswordAuthenticationToken toAuthentication() {
    }
}
