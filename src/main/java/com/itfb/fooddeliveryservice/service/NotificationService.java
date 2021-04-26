package com.itfb.fooddeliveryservice.service;

import com.itfb.fooddeliveryservice.model.domain.Customer;
import com.itfb.fooddeliveryservice.model.domain.order.Order;
import com.itfb.fooddeliveryservice.model.notification.Attachment;
import com.itfb.fooddeliveryservice.model.notification.NotificationMessage;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class NotificationService {

    public NotificationMessage configureNotificationMessage(Customer customer, Order order, String template) {
        NotificationMessage notificationMessage = new NotificationMessage();
        notificationMessage.setTemplate(template);
        notificationMessage.setEmail(customer.getEmail());
        notificationMessage.setPhone("");
        notificationMessage.setEmailEnabled(customer.isEmailNotification());
        notificationMessage.setPhoneEnabled(customer.isPhoneNotification());
        notificationMessage.addAttributes("name", customer.getLogin());
        notificationMessage.addAttributes("orderId", String.valueOf(order.getId()));
        notificationMessage.addAttributes("amount", String.valueOf(order.getAmount()));
        return notificationMessage;
    }

    public NotificationMessage configureNotificationMessage(Customer customer, Order order, String template, Attachment... attachments) {
        NotificationMessage notificationMessage = configureNotificationMessage(customer, order, template);
        Arrays.stream(attachments).forEach(notificationMessage::addAttachment);
        return notificationMessage;
    }

}
