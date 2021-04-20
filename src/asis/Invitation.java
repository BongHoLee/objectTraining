package asis;

import java.time.LocalDateTime;

// 초대장
public class Invitation {
  private LocalDateTime when;

  public Invitation(LocalDateTime when) {
    this.when = when;
  }

  public LocalDateTime getWhen() {
    return when;
  }
}
