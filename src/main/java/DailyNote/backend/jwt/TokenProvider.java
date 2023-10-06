package DailyNote.backend.jwt;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.security.Key;

@Slf4j
@Component
public class TokenProvider {

    private static final String AUTHORITIES_KEY = "auth";
    private static final String BEARER_TYPE = "Bearer";
    private static final long ACCESS_TOKEN_EXPIRE_TIME = 100 * 60 * 30;
    private static final long REFRESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 60 * 24 * 7;


}
