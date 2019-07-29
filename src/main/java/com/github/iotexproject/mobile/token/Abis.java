package com.github.iotexproject.mobile.token;

/**
 * contract abis.
 *
 * @author Yang XuePing
 */
public interface Abis {
    String XRC20 = "[\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"name\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"string\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"cycleIncrementalSupply\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"totalSupply\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"donationPoolAddress\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"decimals\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint8\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"lastClaimViewIDs\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"unpause\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"genesisPoolAddress\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"vps\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"paused\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"lastDonationPoolClaimViewID\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"balanceOf\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"pause\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"rewardPoolAddress\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"owner\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"authNonces\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"symbol\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"string\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"lastRewardPoolClaimViewID\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_spender\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"allowance\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"cycleLength\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint8\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"newOwner\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"transferOwnership\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_vps\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_genesisPoolAddress\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_rewardPoolAddress\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_donationPoolAddress\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"constructor\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"claimer\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"amount\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"viewID\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"Claim\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"height\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"incremetnalSupply\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"Decay\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"viewID\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"UpdateView\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"Pause\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"Unpause\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"previousOwner\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"newOwner\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"OwnershipTransferred\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"spender\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"value\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"Approval\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"anonymous\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"from\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": true,\n" +
            "            \"name\": \"to\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"indexed\": false,\n" +
            "            \"name\": \"value\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"Transfer\",\n" +
            "      \"type\": \"event\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_to\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_value\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"transfer\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_from\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_to\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_value\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"transferFrom\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_spender\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_value\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"approve\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_spender\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_addedValue\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"increaseApproval\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"success\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_spender\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"_subtractedValue\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"decreaseApproval\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"success\",\n" +
            "            \"type\": \"bool\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_newRewardPool\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"setRewardPoolAddress\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_newDonationPool\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"setDonationPoolAddress\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"_newVPS\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"setVPS\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"cycle\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"stakingPoolSize\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"rewardPoolSize\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"donationPoolSize\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"incrementalSupply\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"decayedIncrementalSupply\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"updateCycle\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": true,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"claimableAmount\",\n" +
            "      \"outputs\": [\n" +
            "         {\n" +
            "            \"name\": \"\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"view\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [],\n" +
            "      \"name\": \"claim\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"owner\",\n" +
            "            \"type\": \"address\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"signature\",\n" +
            "            \"type\": \"bytes\"\n" +
            "         },\n" +
            "         {\n" +
            "            \"name\": \"nonce\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"claimAs\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   },\n" +
            "   {\n" +
            "      \"constant\": false,\n" +
            "      \"inputs\": [\n" +
            "         {\n" +
            "            \"name\": \"amount\",\n" +
            "            \"type\": \"uint256\"\n" +
            "         }\n" +
            "      ],\n" +
            "      \"name\": \"burn\",\n" +
            "      \"outputs\": [],\n" +
            "      \"payable\": false,\n" +
            "      \"stateMutability\": \"nonpayable\",\n" +
            "      \"type\": \"function\"\n" +
            "   }\n" +
            "]";
}
