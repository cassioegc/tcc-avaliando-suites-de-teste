(function() {
    'use strict';

    angular
        .module('tccmanagerApp')
        .controller('AlunoDetailController', AlunoDetailController);

    AlunoDetailController.$inject = ['$scope', '$rootScope', '$stateParams', 'previousState', 'entity', 'Aluno', 'Professor'];

    function AlunoDetailController($scope, $rootScope, $stateParams, previousState, entity, Aluno, Professor) {
        var vm = this;

        vm.aluno = entity;
        vm.previousState = previousState.name;

        var unsubscribe = $rootScope.$on('tccmanagerApp:alunoUpdate', function(event, result) {
            vm.aluno = result;
        });
        $scope.$on('$destroy', unsubscribe);
    }
})();
