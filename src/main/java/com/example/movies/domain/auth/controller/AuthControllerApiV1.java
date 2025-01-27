package com.example.movies.domain.auth.controller;

import com.example.movies.domain.auth.dto.ReqJoinDTO;
import com.example.movies.domain.auth.dto.ReqLoginDTO;
import com.example.movies.domain.auth.service.AuthServiceApiV1;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class AuthControllerApiV1 {
    private final AuthServiceApiV1 authServiceApiV1;

    @PostMapping("/join")
    public ResponseEntity<?> join (@RequestBody ReqJoinDTO dto){
        ResponseEntity<?> responseEntity = authServiceApiV1.join(dto);

        return responseEntity;
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ReqLoginDTO dto, HttpSession session) {
        ResponseEntity<?> responseEntity = authServiceApiV1.login(dto, session);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            // 세션에 user 속성을 설정
            session.setAttribute("user", true);
        }

        return responseEntity;

    }

    @GetMapping("/status")
    public ResponseEntity<Boolean> checkLoginStatus(HttpSession session) {
        boolean isLoggedIn = session.getAttribute("user") != null;
        return ResponseEntity.ok(isLoggedIn);
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(HttpSession session) {
        session.invalidate(); // 세션 무효화
        return ResponseEntity.ok("로그아웃되었습니다.");
    }
}
