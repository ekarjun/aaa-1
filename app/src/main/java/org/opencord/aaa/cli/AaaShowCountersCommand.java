/*
 * Copyright 2016-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opencord.aaa.cli;

import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.cli.AbstractShellCommand;
import org.opencord.aaa.AaaStatistics;
import org.opencord.aaa.AuthenticationStatisticsService;

/**
 * Display current value of all aaa statistics counters.
 */
@Service
@Command(scope = "onos", name = "show-aaa-counters",
description = "Display current value of all aaa statistics counters")
public class AaaShowCountersCommand extends AbstractShellCommand {
    @Override
    protected void doExecute() {

        AaaStatistics aaaStats = new AaaStatistics();

        AuthenticationStatisticsService aaaStatisticsManager =
                AbstractShellCommand.get(AuthenticationStatisticsService.class);
        aaaStats = aaaStatisticsManager.getAaaStats();

        System.out.format("%30s %10d\n", "AccessRequestsTx", aaaStats.getAccessRequestsTx());
        System.out.format("%30s %10d\n", "ChallengeResponsesRx", aaaStats.getChallengeResponsesRx());
        System.out.format("%30s %10d\n", "RequestReTx", aaaStats.getRequestReTx());
        System.out.format("%30s %10d\n", "AcceptResponsesRx", aaaStats.getAcceptResponsesRx());
        System.out.format("%30s %10d\n", "RejectResponsesRx", aaaStats.getRejectResponsesRx());
        System.out.format("%30s %10d\n", "PendingRequests", aaaStats.getPendingRequests());
        System.out.format("%30s %10d\n", "DroppedResponsesRx", aaaStats.getDroppedResponsesRx());
        System.out.format("%30s %10d\n", "InvalidValidatorsRx", aaaStats.getInvalidValidatorsRx());
        System.out.format("%30s %10d\n", "MalformedResponsesRx", aaaStats.getMalformedResponsesRx());
        System.out.format("%30s %10d\n", "UnknownServerRx", aaaStats.getUnknownServerRx());
        System.out.format("%30s %10d\n", "UnknownTypeRx", aaaStats.getUnknownTypeRx());
        System.out.format("%30s %10d\n", "RequestRttMillis", aaaStats.getRequestRttMilis());
        System.out.format("%30s %10d\n", "EapolLogoffRx", aaaStats.getEapolLogoffRx());
        System.out.format("%30s %10d\n", "EapolAuthSuccessTrans", aaaStats.getEapolAuthSuccessTrans());
        System.out.format("%30s %10d\n", "EapolAuthFailureTrans", aaaStats.getEapolAuthFailureTrans());
        System.out.format("%30s %10d\n", "EapolStartReqTrans", aaaStats.getEapolStartReqTrans());
        System.out.format("%30s %10d\n", "EapolTransRespNotNak", aaaStats.getEapolTransRespNotNak());
        System.out.format("%30s %10d\n", "EapPktTxauthChooseEap", aaaStats.getEapPktTxauthChooseEap());
        System.out.format("%30s %10d\n", "EapolResIdentityMsgTrans", aaaStats.getEapolResIdentityMsgTrans());
        System.out.format("%30s %10d\n", "AuthStateIdle", aaaStats.getAuthStateIdle());
        System.out.format("%30s %10d\n", "RequestIdFramesTx", aaaStats.getRequestIdFramesTx());
        System.out.format("%30s %10d\n", "ReqEapFramesTx", aaaStats.getReqEapFramesTx());
        System.out.format("%30s %10d\n", "InvalidPktType", aaaStats.getInvalidPktType());
        System.out.format("%30s %10d\n", "InvalidBodyLength", aaaStats.getInvalidBodyLength());
        System.out.format("%30s %10d\n", "ValidEapolFramesRx", aaaStats.getValidEapolFramesRx());
        System.out.format("%30s %10d\n", "PendingResSupp", aaaStats.getPendingResSupp());
        System.out.format("%30s %10d\n", "EapolFramesTx", aaaStats.getEapolFramesTx());
        System.out.format("%30s %10d\n", "TimedOutPackets", aaaStats.getTimedOutPackets());

  }
}
