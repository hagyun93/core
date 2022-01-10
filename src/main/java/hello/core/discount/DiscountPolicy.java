package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /**
     * @return Amount eligible for discount
     */
    int discount(Member member, int price);

}
