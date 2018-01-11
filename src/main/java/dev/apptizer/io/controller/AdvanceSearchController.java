package dev.apptizer.io.controller;

import dev.apptizer.io.domain.SalesAgent;
import dev.apptizer.io.repo.SalesAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Component
@RequestMapping(path = "/")
public class AdvanceSearchController {

    @Autowired
    SalesAgentRepository salesAgentRepository;

    @RequestMapping(method = RequestMethod.POST, path = "/api/v2/agent/search/advance", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<SalesAgent> claimSupportTicket(@RequestBody SalesAgent salesAgent) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues().withIgnoreCase();
        List<SalesAgent> advanceSearch = salesAgentRepository.findAll(Example.of(salesAgent, exampleMatcher));
        return advanceSearch;
    }
}
