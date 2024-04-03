
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ClimbingClimbingMembershipManager from "./components/listers/ClimbingClimbingMembershipCards"
import ClimbingClimbingMembershipDetail from "./components/listers/ClimbingClimbingMembershipDetail"
import ClimbingClimbingTrainingCourseTicketManager from "./components/listers/ClimbingClimbingTrainingCourseTicketCards"
import ClimbingClimbingTrainingCourseTicketDetail from "./components/listers/ClimbingClimbingTrainingCourseTicketDetail"

import RemineMembershipRemineManager from "./components/listers/RemineMembershipRemineCards"
import RemineMembershipRemineDetail from "./components/listers/RemineMembershipRemineDetail"
import RemineTrainingRemineManager from "./components/listers/RemineTrainingRemineCards"
import RemineTrainingRemineDetail from "./components/listers/RemineTrainingRemineDetail"

import TrainingCourseClimbingTrainingCourseInfoManager from "./components/listers/TrainingCourseClimbingTrainingCourseInfoCards"
import TrainingCourseClimbingTrainingCourseInfoDetail from "./components/listers/TrainingCourseClimbingTrainingCourseInfoDetail"

import NotificationClimbingNotificationManager from "./components/listers/NotificationClimbingNotificationCards"
import NotificationClimbingNotificationDetail from "./components/listers/NotificationClimbingNotificationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/climbings/climbingMemberships',
                name: 'ClimbingClimbingMembershipManager',
                component: ClimbingClimbingMembershipManager
            },
            {
                path: '/climbings/climbingMemberships/:id',
                name: 'ClimbingClimbingMembershipDetail',
                component: ClimbingClimbingMembershipDetail
            },
            {
                path: '/climbings/climbingTrainingCourseTickets',
                name: 'ClimbingClimbingTrainingCourseTicketManager',
                component: ClimbingClimbingTrainingCourseTicketManager
            },
            {
                path: '/climbings/climbingTrainingCourseTickets/:id',
                name: 'ClimbingClimbingTrainingCourseTicketDetail',
                component: ClimbingClimbingTrainingCourseTicketDetail
            },

            {
                path: '/remines/membershipRemines',
                name: 'RemineMembershipRemineManager',
                component: RemineMembershipRemineManager
            },
            {
                path: '/remines/membershipRemines/:id',
                name: 'RemineMembershipRemineDetail',
                component: RemineMembershipRemineDetail
            },
            {
                path: '/remines/trainingRemines',
                name: 'RemineTrainingRemineManager',
                component: RemineTrainingRemineManager
            },
            {
                path: '/remines/trainingRemines/:id',
                name: 'RemineTrainingRemineDetail',
                component: RemineTrainingRemineDetail
            },

            {
                path: '/trainingCourses/climbingTrainingCourseInfos',
                name: 'TrainingCourseClimbingTrainingCourseInfoManager',
                component: TrainingCourseClimbingTrainingCourseInfoManager
            },
            {
                path: '/trainingCourses/climbingTrainingCourseInfos/:id',
                name: 'TrainingCourseClimbingTrainingCourseInfoDetail',
                component: TrainingCourseClimbingTrainingCourseInfoDetail
            },

            {
                path: '/notifications/climbingNotifications',
                name: 'NotificationClimbingNotificationManager',
                component: NotificationClimbingNotificationManager
            },
            {
                path: '/notifications/climbingNotifications/:id',
                name: 'NotificationClimbingNotificationDetail',
                component: NotificationClimbingNotificationDetail
            },



    ]
})
