package fnl;

import java.util.ArrayList;
import java.util.List;

// 매표소
public class TicketOffice {

  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amount, List<Ticket> tickets) {
    this.amount = amount;
    this.tickets = tickets;
  }

  // 자율적인 존재가 되었지만 Audience에 대한 의존성이 추가됨.
  public void sellTicketTo(Audience audience) {
    Ticket ticket = getTicket();
    plusAmount(audience.buy(ticket));

  }

  private Ticket getTicket() {
    return tickets.remove(0);
  }

  private void plusAmount(Long amount) {
    this.amount += amount;
  }
}
