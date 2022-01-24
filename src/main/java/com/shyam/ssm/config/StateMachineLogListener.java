package com.shyam.ssm.config;

import com.shyam.ssm.domain.PaymentEvent;
import com.shyam.ssm.domain.PaymentState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

@Slf4j
public class StateMachineLogListener extends StateMachineListenerAdapter<PaymentState, PaymentEvent> {
    @Override
    public void stateChanged(State<PaymentState, PaymentEvent> from, State<PaymentState, PaymentEvent> to) {
        log.info(String.format("stateChange(from: %s, to: %s)", from.toString(), to.toString()));
    }
}
